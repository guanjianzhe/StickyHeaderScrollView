package com.kongnan.headerscrollview;

import android.view.View;

public interface IStickyHeader {
    void onHeaderScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY);

    int getLastStickyHeight();
}
