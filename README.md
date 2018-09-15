# 记录自己学习《图解设计模式》这本书的全部过程
本书上传的所有代码都是可以运行的，在此附上本书源码地址： [http://www.ituring.com.cn/book/1811](http://www.ituring.com.cn/book/1811)<br/>
在此向本书作者和译者表示感谢

## 运行环境 ##
Eclipse版本：Oxygen.2 Release (4.7.2)<br/>
JDK版本：jdk1.7.0_79

## 代码结构 ##

## 运行结果 ##
### 第一章-Iterator（迭代器）模式 ###
示例
![](https://i.imgur.com/GZDJh5C.png)
习题1-1
![](https://i.imgur.com/Nq2hL7h.png)
### 第二章-Adapter（适配器）模式 ###
使用继承的示例
![](https://i.imgur.com/ahVgADk.png)
使用委托的示例
![](https://i.imgur.com/pCAvtTW.png)
习题2-2：修改了适配器代码，可以打印出新的文件
![](https://i.imgur.com/T0EVo2q.png)
### 第三章-Template Method（模版）模式 ###
示例
![](https://i.imgur.com/a4RBk0q.png)
### 第四章-Factory Method（工厂）模式 ###
示例
![](https://i.imgur.com/3vSxlja.png)
习题4-2
![](https://i.imgur.com/QAAL7JE.png)
### 第五章-Singleton（单例）模式 ###
示例
![](https://i.imgur.com/yZkxsLr.png)
习题5-1
![](https://i.imgur.com/DnNUuDs.png)
习题5-2
![](https://i.imgur.com/NNf1nPE.png)
### 第六章-Prototype（原型）模式 ###
示例
![](https://i.imgur.com/qOx1ksd.png)
### 第七章-Builder（建造者）模式 ###
示例
![](https://i.imgur.com/hOd4EmM.png)
![](https://i.imgur.com/kdK1Ohr.png)
习题7-3
![](https://i.imgur.com/rryvFBD.png)
### 第八章-Abstract Factory（抽象工厂）模式 ###
示例
![](https://i.imgur.com/VbxLOLr.png)
![](https://i.imgur.com/LvNAC1U.png)
习题8-2
![](https://i.imgur.com/74xRtxg.png)
### 第九章-Bridge（桥接）模式 ###
示例
![](https://i.imgur.com/SsI28zo.png)
习题9-1
![](https://i.imgur.com/Yoj3NqL.png)
习题9-2
![](https://i.imgur.com/gfV2awX.png)
习题9-3
![](https://i.imgur.com/WAfS5c8.png)
### 第十章-Strategy（策略）模式 ###
![](https://i.imgur.com/aojP8ZA.png)
习题10-1
![](https://i.imgur.com/pt1G8XV.png)
习题10-4
![](https://i.imgur.com/RrHLciB.png)
## 总结 ##
1. Iterator模式：遍历与实现分离，遍历的时候不依赖实现。
2. Adapter模式：版本升级和兼容性，现有的类已经被测试过，创建一个新类来适配，只需要测试新类，如果出现了Bug，可以很容易的知道问题所在。
3. Template Method模式：在父类中定义处理流程的框架，在子类中实现具体处理，避开使用instanceof指定子类。
4. Factory Method模式：框架与具体加工分离。
5. Singleton模式：获取唯一一个实例（延迟加载，同步机制）。
6. Prototype模式：根据实例（实例原型、实例模型）来生成新实例。
7. Builder模式：可替换性，可以替换Builder组件类。
8. Abstract Factory模式：易于增加具体工厂，难以增加新的零件。
9. Bridge模式：将类的功能层次和实现层次分开。继承是强关联，委托是弱关联。
10. Strategy模式：使用委托这种弱关联关系可以很方便地整体替换算法。