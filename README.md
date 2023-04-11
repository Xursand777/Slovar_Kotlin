# Slovar_Kotlin

      plugins {
      id 'kotlin-kapt'
      
      }


       dependencies {
       
       def room_version = "2.5.0"
    implementation "androidx.room:room-runtime:$room_version"
    annotationProcessor "androidx.room:room-compiler:$room_version"
    // To use Kotlin annotation processing tool (kapt)
    kapt "androidx.room:room-compiler:$room_version"
       
       }
