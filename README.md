GridLayout Library
==================

This library provides a version of `GridLayout` that works across all versions
of Android 1.5+.  As a side effect, this library also includes the lightweight
`Space` view.



Usage
=====

Construct grid layouts exactly as you would with the native variant.

For example,

```xml
<com.gridlayout.GridLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="fill_parent"
    android:layout_height="fill_parent"
    android:useDefaultMargins="true"
    android:alignmentMode="alignBounds"
    android:rowOrderPreserved="false"
    android:columnCount="4">
    <!-- Child views go here! -->
</com.gridlayout.GridLayout>
```

Notice that we still use the `android`-prefixed attributes. **This requires
that you compile your application with Android 4.0 or newer.**

You can also create grids programmatically using the `GridLayout.Spec` and
`GridLayout.LayoutParams` classes which do not carry any requirements of the
compilation platform.

Take a look at examples ported from the platform API Demos in the `samples/`
folder.


Caveats
-------

Due to the inability to detect changes in child visibility in older versions
of `ViewGroup`, it is necessary to call `notifyChildVisibilityChanged()`
whenever you change the visibility of a child view.

If you never change the visibility of children you don't have to worry about
this.

There is an example of how to do this properly in the `samples/` folder.



Maintained By
=============

 * Daniel Lew
 * Jake Wharton - <jakewharton@gmail.com>



License
=======

    Copyright 2011 The Android Open Source Project
    Copyright 2012 Daniel Lew, Jake Wharton

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
