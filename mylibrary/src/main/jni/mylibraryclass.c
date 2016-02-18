#include <jni.h>
#include <android/log.h>

JNIEXPORT void JNICALL
Java_com_salesforce_mylibrary_MyLibraryClass_helloNative(JNIEnv *env, jclass type) {

    __android_log_print(ANDROID_LOG_INFO, "mylibrary", "Hello from C++");
}
