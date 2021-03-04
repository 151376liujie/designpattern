package com.jonnyliu.proj.designpattern.state;

/**
 * @author liujie
 * 状态模式接口
 */
public interface State {

    Context getContext();

    void setContext(Context context);

    void handle();

}
