package com.jduong.laptimeviewer.model

import android.content.Context
import android.os.Environment
import java.io.File
import java.io.IOException

class csvModel(val mContext : Context) {

   fun loadAvailableCSVs(){

      val fileDirectory = mContext.getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS)
       try{




       }catch (ioException : IOException){
          throw ioException.fillInStackTrace()
       }


   }

}