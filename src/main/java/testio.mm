<map version="freeplane 1.3.0" >
<!--To view this file, download free mind mapping software Freeplane from http://freeplane.sourceforge.net -->
<attribute_registry FONT_SIZE="6"/>
<node TEXT="项目" LOCALIZED_STYLE_REF="AutomaticLayout.level.root" ID="ID_0" STYLE="bubble">
    <font NAME="Liberation Sans" SIZE="12" BOLD="true"/>
    <edge STYLE="bezier" COLOR="#000000" WIDTH="thin"/>
    <hook NAME="AlwaysUnfoldedNode"/>
    <hook NAME="MapStyle" zoom="1" layout="fork"/>
    <hook NAME="accessories/plugins/AutomaticLayout.properties" VALUE="ALL"/>
    <node TEXT="程序说明：" POSITION="right" ID="ID_2"/>
        <node TEXT="定义包com.mingrisoft" POSITION="right" ID="ID_211">
                <node TEXT="导入嘉娃包.抽象窗口工具包.分隔布局" POSITION="right" ID="ID_2121"/>
                <node TEXT="导入嘉娃包.抽象窗口工具包.颜色" POSITION="right" ID="ID_2121"/>
                <node TEXT="导入嘉娃包.抽象窗口工具包.EventQueue" POSITION="right" ID="ID_2121"/>
                <node TEXT="导入嘉娃包.抽象窗口工具包.Font" POSITION="right" ID="ID_2121"/>
                <node TEXT="导入嘉娃包.抽象窗口工具包.事件包.动作事件" POSITION="right" ID="ID_2121"/>
                <node TEXT="导入嘉娃包.抽象窗口工具包.事件包.动作监听器" POSITION="right" ID="ID_2121"/>
                <node TEXT="导入嘉娃包.输入输出包.文件输出流" POSITION="right" ID="ID_2121"/>
                <node TEXT="导入嘉娃包.输入输出包.输入输出异常" POSITION="right" ID="ID_2121"/>
                <node TEXT="导入嘉娃包.输入输出包.InputStream" POSITION="right" ID="ID_2121"/>
                <node TEXT="导入嘉娃包.网络包.HttpURLConnection" POSITION="right" ID="ID_2121"/>
                <node TEXT="导入嘉娃包.网络包.MalformedURLException" POSITION="right" ID="ID_2121"/>
                <node TEXT="导入嘉娃包.网络包.URL" POSITION="right" ID="ID_2121"/>
                <node TEXT="导入嘉娃扩展包.用户界面开发工具包.嘉按钮" POSITION="right" ID="ID_2121"/>
                <node TEXT="导入嘉娃扩展包.用户界面开发工具包.嘉窗口" POSITION="right" ID="ID_2121"/>
                <node TEXT="导入嘉娃扩展包.用户界面开发工具包.嘉标签" POSITION="right" ID="ID_2121"/>
                <node TEXT="导入嘉娃扩展包.用户界面开发工具包.嘉对话框" POSITION="right" ID="ID_2121"/>
                <node TEXT="导入嘉娃扩展包.用户界面开发工具包.嘉文本框" POSITION="right" ID="ID_2122"/>
                <node TEXT="定义公共的BreakPointSuperveneFrame类扩展嘉娃扩展包.用户界面开发工具包.嘉窗口" POSITION="right" ID="ID_211111001">
                    <node TEXT="成员属性" POSITION="right" ID="ID_21111211001">
                        <node TEXT="-readToPos = 0:长整数类型" POSITION="right" ID="ID_2111121110019"/>
                        <node TEXT="-residuaryLength = 0:长整数类型" POSITION="right" ID="ID_21111211100110"/>
                        <node TEXT="-tf_address:嘉文本框" POSITION="right" ID="ID_2111121110014"/>
                        <node TEXT="-tf_endPos:嘉文本框" POSITION="right" ID="ID_2111121110015"/>
                        <node TEXT="-tf_readToPos:嘉文本框" POSITION="right" ID="ID_2111121110013"/>
                        <node TEXT="-tf_residuaryLength:嘉文本框" POSITION="right" ID="ID_2111121110012"/>
                        <node TEXT="-tf_startPos:嘉文本框" POSITION="right" ID="ID_2111121110016"/>
                        <node TEXT="-tf_totalLength:嘉文本框" POSITION="right" ID="ID_2111121110011"/>
                        <node TEXT="-totalLength = 0:长整数类型" POSITION="right" ID="ID_2111121110018"/>
                        <node TEXT="-urlAddress = &quot;&quot;:字符串" POSITION="right" ID="ID_2111121110017"/>
                    </node>
                    <node TEXT="成员方法" POSITION="right" ID="ID_21111311001">
                        <node TEXT="+BreakPointSuperveneFrame()" POSITION="right" ID="ID_211113112">
                                <node TEXT="请求超类()" ID="ID_root.001"/>
                                <node TEXT="请求取内容容器().设置布局(空值)" ID="ID_root.002"/>
                                <node TEXT="请求设置标题(&quot;下载网络资源的断点续传&quot;)" ID="ID_root.003"/>
                                <node TEXT="请求设置边界(100,100,514,238)" ID="ID_root.004"/>
                                <node TEXT="请求setDefaultCloseOperation(嘉窗口.EXIT_ON_CLOSE)" ID="ID_root.005"/>
                                <node TEXT="将嘉文本框()构建的实例赋给tf_startPos" ID="ID_root.006"/>
                                <node TEXT="请求tf_startPos.设置边界(80,165,113,22)" ID="ID_root.007"/>
                                <node TEXT="请求取内容容器().添加表项(tf_startPos)" ID="ID_root.008"/>
                                <node TEXT="使用嘉标签()创建嘉标签的常量label" ID="ID_root.009"/>
                                <node TEXT="请求label.设置文本(&quot;起始位置：&quot;)" ID="ID_root.010"/>
                                <node TEXT="请求label.设置边界(10,167,74,18)" ID="ID_root.011"/>
                                <node TEXT="请求取内容容器().添加表项(label)" ID="ID_root.012"/>
                                <node TEXT="使用嘉标签()创建嘉标签的常量label_1" ID="ID_root.013"/>
                                <node TEXT="请求label_1.设置文本(&quot;结束位置：&quot;)" ID="ID_root.014"/>
                                <node TEXT="请求label_1.设置边界(199,167,74,18)" ID="ID_root.015"/>
                                <node TEXT="请求取内容容器().添加表项(label_1)" ID="ID_root.016"/>
                                <node TEXT="将嘉文本框()构建的实例赋给tf_endPos" ID="ID_root.017"/>
                                <node TEXT="请求tf_endPos.设置边界(267,165,117,22)" ID="ID_root.018"/>
                                <node TEXT="请求取内容容器().添加表项(tf_endPos)" ID="ID_root.019"/>
                                <node TEXT="使用嘉标签()创建嘉标签的常量label_2" ID="ID_root.020"/>
                                <node TEXT="请求label_2.设置文本(&quot;网络资源的地址：&quot;)" ID="ID_root.021"/>
                                <node TEXT="请求label_2.设置边界(10,52,113,18)" ID="ID_root.022"/>
                                <node TEXT="请求取内容容器().添加表项(label_2)" ID="ID_root.023"/>
                                <node TEXT="将嘉文本框()构建的实例赋给tf_address" ID="ID_root.024"/>
                                <node TEXT="请求tf_address.添加动作监听器(新对象 动作监听器(){公共的 空类型 执行的动作(不变的 动作事件 异常事件){尝试{urlAddress赋值tf_address.取文本().trim();URL url赋值新对象 URL(urlAddress);HttpURLConnection connection赋值(HttpURLConnection)url.openConnection();connection.connect();totalLength赋值connection.getContentLength();connection.disconnect();tf_totalLength.设置文本(转为字符串(totalLength));tf_readToPos.设置文本(&quot;0&quot;);residuaryLength赋值totalLength;tf_residuaryLength.设置文本(转为字符串(residuaryLength));}捕获(MalformedURLException e1){e1的相应信息显示();}捕获(输入输出异常 e2){e2的相应信息显示();}}})" ID="ID_root.025"/>
                                <node TEXT="请求tf_address.设置边界(119,50,365,22)" ID="ID_root.026"/>
                                <node TEXT="请求取内容容器().添加表项(tf_address)" ID="ID_root.027"/>
                                <node TEXT="使用嘉标签()创建嘉标签的常量label_3" ID="ID_root.028"/>
                                <node TEXT="请求label_3.setForeground(新对象 颜色(0,0,255))" ID="ID_root.029"/>
                                <node TEXT="请求label_3.setFont(新对象 Font(&quot;&quot;,Font.BOLD,14))" ID="ID_root.030"/>
                                <node TEXT="请求label_3.设置文本(&quot;输入网络资源的地址并回车，可以获得网络资源的大小。&quot;)" ID="ID_root.031"/>
                                <node TEXT="请求label_3.设置边界(10,10,384,22)" ID="ID_root.032"/>
                                <node TEXT="请求取内容容器().添加表项(label_3)" ID="ID_root.033"/>
                                <node TEXT="使用嘉标签()创建嘉标签的常量label_4" ID="ID_root.034"/>
                                <node TEXT="请求label_4.setForeground(新对象 颜色(128,0,0))" ID="ID_root.035"/>
                                <node TEXT="请求label_4.设置文本(&quot;网络资源的大小为&quot;)" ID="ID_root.036"/>
                                <node TEXT="请求label_4.设置边界(10,76,113,38)" ID="ID_root.037"/>
                                <node TEXT="请求取内容容器().添加表项(label_4)" ID="ID_root.038"/>
                                <node TEXT="使用嘉标签()创建嘉标签的常量label_5" ID="ID_root.039"/>
                                <node TEXT="请求label_5.设置文本(&quot;上次读取到&quot;)" ID="ID_root.040"/>
                                <node TEXT="请求label_5.设置边界(10,123,74,18)" ID="ID_root.041"/>
                                <node TEXT="请求取内容容器().添加表项(label_5)" ID="ID_root.042"/>
                                <node TEXT="将嘉文本框()构建的实例赋给tf_readToPos" ID="ID_root.043"/>
                                <node TEXT="请求tf_readToPos.设置边界(80,121,113,22)" ID="ID_root.044"/>
                                <node TEXT="请求tf_readToPos.设置可用性(假)" ID="ID_root.045"/>
                                <node TEXT="请求取内容容器().添加表项(tf_readToPos)" ID="ID_root.046"/>
                                <node TEXT="使用嘉标签()创建嘉标签的常量label_6" ID="ID_root.047"/>
                                <node TEXT="请求label_6.设置文本(&quot;字节处，还剩&quot;)" ID="ID_root.048"/>
                                <node TEXT="请求label_6.设置边界(202,123,87,18)" ID="ID_root.049"/>
                                <node TEXT="请求取内容容器().添加表项(label_6)" ID="ID_root.050"/>
                                <node TEXT="将嘉文本框()构建的实例赋给tf_residuaryLength" ID="ID_root.051"/>
                                <node TEXT="请求tf_residuaryLength.设置边界(285,120,117,22)" ID="ID_root.052"/>
                                <node TEXT="请求tf_residuaryLength.设置可用性(假)" ID="ID_root.053"/>
                                <node TEXT="请求取内容容器().添加表项(tf_residuaryLength)" ID="ID_root.054"/>
                                <node TEXT="使用嘉标签()创建嘉标签的常量label_7" ID="ID_root.055"/>
                                <node TEXT="请求label_7.设置文本(&quot;字节未读。&quot;)" ID="ID_root.056"/>
                                <node TEXT="请求label_7.设置边界(404,123,80,18)" ID="ID_root.057"/>
                                <node TEXT="请求取内容容器().添加表项(label_7)" ID="ID_root.058"/>
                                <node TEXT="使用嘉标签()创建嘉标签的常量label_4_1" ID="ID_root.059"/>
                                <node TEXT="请求label_4_1.setForeground(新对象 颜色(128,0,0))" ID="ID_root.060"/>
                                <node TEXT="请求label_4_1.设置文本(&quot;个字节。&quot;)" ID="ID_root.061"/>
                                <node TEXT="请求label_4_1.设置边界(404,76,80,38)" ID="ID_root.062"/>
                                <node TEXT="请求取内容容器().添加表项(label_4_1)" ID="ID_root.063"/>
                                <node TEXT="将嘉文本框()构建的实例赋给tf_totalLength" ID="ID_root.064"/>
                                <node TEXT="请求tf_totalLength.设置边界(119,84,283,22)" ID="ID_root.065"/>
                                <node TEXT="请求tf_totalLength.设置可用性(假)" ID="ID_root.066"/>
                                <node TEXT="请求取内容容器().添加表项(tf_totalLength)" ID="ID_root.067"/>
                                <node TEXT="使用嘉按钮()创建嘉按钮的常量button" ID="ID_root.068"/>
                                <node TEXT="请求button.设置边界(395,162,89,28)" ID="ID_root.069"/>
                                <node TEXT="请求取内容容器().添加表项(button)" ID="ID_root.070"/>
                                <node TEXT="请求button.添加动作监听器(新对象 动作监听器(){公共的 空类型 执行的动作(不变的 动作事件 异常事件){如果(totalLength等于0){嘉对话框.显示消息对话框(空值,&quot;没有网络资源。\n\n请输入正确的网址，然后回车。&quot;);返回;}长整数类型 startPos赋值0;长整数类型 endPos赋值0;尝试{startPos赋值长整数.转为长整数(tf_startPos.取文本().trim());endPos赋值长整数.转为长整数(tf_endPos.取文本().trim());}捕获(异常 ex){嘉对话框.显示消息对话框(空值,&quot;输入的起始位置或结束位置不正确。&quot;);返回;}readToPos赋值endPos;residuaryLength赋值totalLength-readToPos;tf_readToPos.设置文本(转为字符串(readToPos));tf_residuaryLength.设置文本(转为字符串(residuaryLength));tf_startPos.设置文本(转为字符串(readToPos));tf_endPos.设置文本(转为字符串(totalLength));tf_endPos.requestFocus();tf_endPos.selectAll();download(startPos,endPos);}})" ID="ID_root.071"/>
                                <node TEXT="请求button.设置文本(&quot;开始下载&quot;)" ID="ID_root.072"/>
                        </node>
                        <node TEXT="+download(startPosition:长整数类型,endPosition:长整数类型):空类型" POSITION="right" ID="ID_211113113">
                                <node TEXT="异常处理 " ID="ID_root.001">
                                <hook NAME="AlwaysUnfoldedNode"/>
                                    <node TEXT="尝试执行 " ID="ID_root.001.001">
                                    <hook NAME="AlwaysUnfoldedNode"/>
                                        <node TEXT="使用URL(urlAddress)创建URL的实例url" ID="ID_root.001.001.001"/>
                                        <node TEXT="说明HttpURLConnection的connection并初始化为(HttpURLConnection)url.openConnection()" ID="ID_root.001.001.002"/>
                                        <node TEXT="请求connection.setRequestProperty(&quot;User-Agent&quot;,&quot;NetFox&quot;)" ID="ID_root.001.001.003"/>
                                        <node TEXT="说明字符串的rangeProperty并初始化为&quot;bytes=&quot;+startPosition+&quot;-&quot;" ID="ID_root.001.001.004"/>
                                        <node TEXT="如果endPosition&gt;0则" ID="ID_root.001.001.005">
                                        <hook NAME="AlwaysUnfoldedNode"/>
                                            <node TEXT="rangeProperty赋值rangeProperty加endPosition" ID="ID_root.001.001.005.001"/>
                                        </node>
                                        <node TEXT="请求connection.setRequestProperty(&quot;RANGE&quot;,rangeProperty)" ID="ID_root.001.001.006"/>
                                        <node TEXT="请求connection.connect()" ID="ID_root.001.001.007"/>
                                        <node TEXT="说明InputStream的in并初始化为connection.getInputStream()" ID="ID_root.001.001.008"/>
                                        <node TEXT="说明字符串的file并初始化为url.获取文件()" ID="ID_root.001.001.009"/>
                                        <node TEXT="说明字符串的name并初始化为file的子串(file.lastIndexOf('/')+1)" ID="ID_root.001.001.010"/>
                                        <node TEXT="使用文件输出流(&quot;c:/&quot;+name,真)创建文件输出流的实例out" ID="ID_root.001.001.011"/>
                                        <node TEXT="使用字节类型[2048]创建字节类型[]的数组buff" ID="ID_root.001.001.012"/>
                                        <node TEXT="说明整数类型的len并初始化为0" ID="ID_root.001.001.013"/>
                                        <node TEXT="len赋值in.读(buff)" ID="ID_root.001.001.014"/>
                                        <node TEXT="当len不等于-1成立时重复做" ID="ID_root.001.001.015">
                                        <hook NAME="AlwaysUnfoldedNode"/>
                                            <node TEXT="请求out.写(buff,0,len)" ID="ID_root.001.001.015.001"/>
                                            <node TEXT="len赋值in.读(buff)" ID="ID_root.001.001.015.002"/>
                                        </node>
                                        <node TEXT="请求out.关闭()" ID="ID_root.001.001.016"/>
                                        <node TEXT="请求in.关闭()" ID="ID_root.001.001.017"/>
                                        <node TEXT="请求connection.disconnect()" ID="ID_root.001.001.018"/>
                                        <node TEXT="如果readToPos&gt;0并且readToPos等于totalLength则" ID="ID_root.001.001.019">
                                        <hook NAME="AlwaysUnfoldedNode"/>
                                            <node TEXT="请求嘉对话框.显示消息对话框(空值,&quot;完成网络资源的下载。\n单击“确定”按钮退出程序。&quot;)" ID="ID_root.001.001.019.001"/>
                                            <node TEXT="请求系统停机退出(0)" ID="ID_root.001.001.019.002"/>
                                        </node>
                                    </node>
                                    <node TEXT="若发生异常类型的异常事件则" ID="ID_root.001.002">
                                    <hook NAME="AlwaysUnfoldedNode"/>
                                        <node TEXT="请求异常事件的相应信息显示()" ID="ID_root.001.002.001"/>
                                    </node>
                                </node>
                        </node>
                        <node TEXT="+静态的主方法(参数系列[]:字符串):空类型" POSITION="right" ID="ID_211113111">
                                <node TEXT="请求EventQueue.invokeLater(新对象 Runnable(){公共的 空类型 运行(){尝试{BreakPointSuperveneFrame frame赋值新对象 BreakPointSuperveneFrame();frame.设置可见性(真);}捕获(异常 异常事件){异常事件的相应信息显示();}}})" ID="ID_root.001"/>
                        </node>
                    </node>
                </node>
        </node>
</node>
</map>
