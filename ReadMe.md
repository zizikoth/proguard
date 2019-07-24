### 添加常用的依赖库的混淆文件

* 开启混淆，设置 minifyEnabled true；
* 添加依赖：
```
	allprojects {
		repositories {
			maven { url 'https://jitpack.io' }
		}
	}
  
  dependencies {
	        implementation 'com.github.zmemo:proguard:1.0.0'
	}
```
* 把项目中的实体类加入到 proguard-rules.pro 文件中，`一般为 -keep class com.memo.proguard/entity.** { *; }，` 或者使用 @Keep 注解这些实体类；
* 把项目中的@JavascriptInterface注解的类不要混淆 `-keepclassmembers class com.just.agentweb.sample.common.AndroidInterface{ *; }`参考AgentWeb
* 把项目中需要防混淆的 jar 加入到 proguard-rules.pro 文件中，比如某些SDK的jar包 `-libraryjars libs/（jar包名称）.jar`，如果要对所有jar包都防混，那么使用 `-libraryjars libs` 即可；
* 查看已经添加的混淆内容，一些没有添加的内容自行添加到 `proguard-rules.pro` 文件中

**AndroidDefault  
AgentWeb  
AMap  
AndroidUtilCode  
ARouter  
Banner  
BaseRecyclerViewAdapterHelper  
Bugly  
ButterKnife  
Dagger  
EventBus  
Glide  
GreenDao  
Gson  
GsyVideoPlayer  
Guava  
ijkPlayer  
jPush  
KotlinxCoroutines  
LeakCanary  
LitePal  
LoadSir  
Matisse  
OkHttp  
Retrofit  
RxJava  
ShareSdk  
UCrop  
UMeng  
ZXing**

