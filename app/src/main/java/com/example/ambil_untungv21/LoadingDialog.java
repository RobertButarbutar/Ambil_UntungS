package com.example.ambil_untungv21;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.LayoutInflater;

class LoadingDialog {
    private Activity signup;
    private AlertDialog dialog;

    LoadingDialog(Activity SignUp){
        signup = SignUp;
    }

    void startLoadingDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(signup);
        LayoutInflater inflater = signup.getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.costum_dialog, null));
        builder.setCancelable(true);
        dialog=builder.create();
        dialog.show();
    }
    void dismissDialog(){

        dialog.dismiss();
    }
}
