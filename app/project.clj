(defproject android-test "0.1.0-SNAPSHOT"
  :plugins [[com.github.luxlang/lein-luxc "0.5.0"]]
  :resource-paths [
                   "src"
                   "/home/randy/Android/Sdk/platforms/android-25/android.jar"
                   "build/intermediates/classes/debug/"
                   "build/intermediates/exploded-aar/com.android.support/appcompat-v7/25.1.1/jars/classes.jar"
                   "build/intermediates/exploded-aar/com.android.support/support-fragment/25.1.1/jars/classes.jar"
                   "build/intermediates/exploded-aar/com.android.support/support-compat/25.1.1/jars/classes.jar"
                   "build/intermediates/exploded-aar/com.android.support/support-core-ui/25.1.1/jars/classes.jar"
                   "build/intermediates/exploded-aar/com.android.support/support-core-utils/25.1.1/jars/classes.jar"
                   "build/intermediates/exploded-aar/com.android.support/support-v4/25.1.1/jars/classes.jar"
                   "build/intermediates/exploded-aar/com.android.support/support-media-compat/25.1.1/jars/classes.jar"
                   "build/intermediates/exploded-aar/com.android.support/support-vector-drawable/25.1.1/jars/classes.jar"
                   "src/main/lux"
                   ]
  :lux {:program "valis/lux/app" :target "libs"
        ;; :android {:sdk "/home/randy/Android/Sdk"
        ;;           :version 25
        ;;           :resources [
        ;;                       ]
        ;;           :manifest "src/main/AndroidManifest.xml"
        ;;           ; :support-lib "/home/randy/Android/Sdk/extras/android/m2repository/com/android/support/appcompat-v7/25.1.0/appcompat-v7-25.1.0-sources.jar"
        ;;           :keystore {
        ;;             :path "/home/randy/.android/debug.keystore"
        ;;             :alias "androiddebugkey"
        ;;             :password "android"
        ;;                      }
        ;;            }
  }
  :source-paths ["src/main"]
 )
