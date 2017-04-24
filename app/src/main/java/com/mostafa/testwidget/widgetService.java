package com.mostafa.testwidget;

import android.content.Intent;
import android.widget.RemoteViewsService;

/**
 * Created by mostafa on 24/04/17.
 */

public class widgetService extends RemoteViewsService {
    @Override
    public RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new WidgetDataProvider(this,intent);
    }
}
