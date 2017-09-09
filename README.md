# EasyGifView
A simple android library to play with GIF

[![](https://jitpack.io/v/IsPra94/EasyGifView.svg)](https://jitpack.io/#IsPra94/EasyGifView)
<a href="http://www.methodscount.com/?lib=com.github.IsPra94%3AEasyGifView%3A-SNAPSHOT"><img src="https://img.shields.io/badge/Size-17 KB-e91e63.svg"/></a>

# Usage

## Gradle
      
1 *Add it in your root build.gradle at the end of repositories*

	  allprojects {
		  repositories {
			  ...
			  maven { url 'https://jitpack.io' }
		  }
	  }
  
  2 *Add the dependency*
  
  	 dependencies {
	         compile 'com.github.IsPra94:EasyGifView:-SNAPSHOT'
	   }
  
## Maven

1 *Add the JitPack repository to your build file*

	 <repositories>
		 <repository>
		     <id>jitpack.io</id>
		     <url>https://jitpack.io</url>
		 </repository>
	 </repositories>
  
 2 *Add the dependency*
 
 	 <dependency>
	    <groupId>com.github.IsPra94</groupId>
	    <artifactId>EasyGifView</artifactId>
	    <version>-SNAPSHOT</version>
	 </dependency>

# In Your Android Project

    <com.medialablk.easygifview.EasyGifView
        android:id="@+id/easyGifView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:src="@drawable/dance" />
        
        
        
    EasyGifView easyGifView = (EasyGifView) findViewById(R.id.easyGifView);
    easyGifView.setGifFromResource(R.drawable.play); //Your own GIF file from Resources
    
  
