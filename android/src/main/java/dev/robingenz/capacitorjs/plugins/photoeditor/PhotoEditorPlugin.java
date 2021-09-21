package dev.robingenz.capacitorjs.plugins.photoeditor;

import android.content.Intent;
import androidx.activity.result.ActivityResult;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.ActivityCallback;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "PhotoEditor")
public class PhotoEditorPlugin extends Plugin {

    public static final String ERROR_PATH_MISSING = "path must be provided.";
    public static final String ERROR_INTENT_NULL = "editPhoto failed.";

    private PhotoEditor implementation;

    @Override
    public void load() {
        implementation = new PhotoEditor(getBridge());
    }

    @PluginMethod
    public void editPhoto(PluginCall call) {
        String path = call.getString("path");
        if (path == null) {
            call.reject(ERROR_PATH_MISSING);
            return;
        }
        Intent intent = implementation.createEditPhotoIntent(path);
        if (intent == null) {
            call.reject(ERROR_INTENT_NULL);
            return;
        }
        startActivityForResult(call, intent, "handleEditPhotoResult");
    }

    @ActivityCallback
    private void handleEditPhotoResult(PluginCall call, ActivityResult result) {
        call.resolve();
    }
}
