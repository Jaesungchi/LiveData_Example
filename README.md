# MVVM_Example

![imge](https://img.shields.io/badge/ProjectType-SingleStudy-green) ![imge](https://img.shields.io/badge/Language-Kotlin-yellow) ![imge](https://img.shields.io/badge/Tools-AndroidStudio-blue)

## MVVM 패턴이란?

MVVM 패턴은 Model - View - ViewModel의 약자로, 기존의 MVP 패턴에서의 View와 Presenter가 의존성이 강하게 연결되는것을 없애기 위해 나온 패턴입니다. 여기서 핵심 기능은 DataBinding 기술입니다.

- View : UI를 담당한다.
- ViewModel : 이벤트 처리나 Model과의 인터렉션을 담당한다.
- Model : UI에 표시될 데이터와 비즈니스 로직을 담당한다.

![img](https://miro.medium.com/max/1534/1*tSHvX51lF0BwYFbmFaobpg.png)

위의 구조를 보면, ViewModel과 Model은 능동적인 역할을 수행합니다. 그리고 또한 DataBinding기법을 통해 기존에 View와 Presenter에서 생기는 의존성에서 벗어날 수 있게 됩니다.



## AAC ?

2017년 Google IO에서 발표한 라이브러리들로 안드로이드 앱을 구성하는데 도움을 주는 컴포넌트로 구성되어 있습니다. 종류로는 **ViewModel, LiveDate, LifeCycle, Room, Paging**으로 되어 있습니다.

MVVM 패턴을 만드는데 AAC를 꼭 사용해야 하는 것은 아니지만 AAC를 사용하면 LifeCycle이나 기타 귀찮은 것들을 처리해주기 때문에 이번 기회에 한번 사용을 해본다.



# 본격 개발!

## 1. 의존성 설정

```xml
//Supoort Libraries
implementation 'androidx.recyclerview:recyclerview:1.2.0-alpha03'
implementation 'com.android.support:cardview-v7:28.0.0'

//Room
implementation 'androidx.room:room-runtime:2.3.0-alpha01'
implementation 'androidx.room:room-compiler:2.3.0-alpha01'
implementation 'androidx.room:room-rxjava2:2.3.0-alpha01'
implementation 'androidx.room:room-testing:2.3.0-alpha01'

//lifecycle
implementation 'androidx.lifecycle:lifecycle-runtime:2.3.0-alpha04'
implementation 'androidx.lifecycle:lifecycle-extensions:2.2.0'
implementation 'androidx.lifecycle:lifecycle-common-java8:2.3.0-alpha04'
implementation 'androidx.lifecycle:lifecycle-compiler:2.3.0-alpha04'
```
