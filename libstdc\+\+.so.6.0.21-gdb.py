import sys
import gdb
import os
import os.path

pythondir = '/home/chris/src/buildroot/buildroot/output/host/usr/share/gcc-5.4.0/python'
libdir = '/home/chris/src/buildroot/buildroot/output/host/usr/arm-buildroot-linux-gnueabihf/lib'

# This file might be loaded when there is no current objfile.  This
# can happen if the user loads it manually.  In this case we don't
# update sys.path; instead we just hope the user managed to do that
# beforehand.
if gdb.current_objfile () is not None:
    # Update module path.  We want to find the relative path from libdir
    # to pythondir, and then we want to apply that relative path to the
    # directory holding the objfile with which this file is associated.
    # This preserves relocatability of the gcc tree.

    # Do a simple normalization that removes duplicate separators.
    pythondir = os.path.normpath (pythondir)
    libdir = os.path.normpath (libdir)

    prefix = os.path.commonprefix ([libdir, pythondir])
    # In some bizarre configuration we might have found a match in the
    # middle of a directory name.
    if prefix[-1] != '/':
        prefix = os.path.dirname (prefix) + '/'

    # Strip off the prefix.
    pythondir = pythondir[len (prefix):]
    libdir = libdir[len (prefix):]

    # Compute the ".."s needed to get from libdir to the prefix.
    dotdots = ('..' + os.sep) * len (libdir.split (os.sep))

    objfile = gdb.current_objfile ().filename
    dir_ = os.path.join (os.path.dirname (objfile), dotdots, pythondir)

    if not dir_ in sys.path:
        sys.path.insert(0, dir_)

# Call a function as a plain import would not execute body of the included file
# on repeated reloads of this object file.
from libstdcxx.v6 import register_libstdcxx_printers
register_libstdcxx_printers(gdb.current_objfile())
