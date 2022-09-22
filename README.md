# LiquidSwipePager

![Animation](https://raw.githubusercontent.com/Cuberto/liquid-swipe/master/Screenshots/animation.gif)

[![](https://jitpack.io/v/Delecom/LiquidSwipePager.svg)](https://jitpack.io/#Delecom/LiquidSwipePager)

### Step 1. Add the JitPack repository to your build file

`Add it in your root build.gradle at the end of repositories:`


```
    allprojects {
	   repositories {
			   ...
		   maven { url 'https://jitpack.io' }
	   }
    }
```

### Step 2. Add the dependency


```
    dependencies {
        implementation 'com.github.Delecom:LiquidSwipePager:latest-version'
    }
```


## Usage

Add LiquidPager to your xml and use it like you would ViewPager

```

    <com.swipe.liquid_pager.LiquidPager
        android:id="@+id/liquidPager"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
        
```
