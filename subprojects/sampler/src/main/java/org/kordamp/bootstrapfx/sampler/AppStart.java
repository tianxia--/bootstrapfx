package org.kordamp.bootstrapfx.sampler;

import javafx.application.Application;

/**
 * 修改 "缺少 JavaFX 运行时组件, 需要使用该组件来运行此应用程序"的问题
 */
public class AppStart {
    public static void main(String[] args){
        Application.launch(Sampler.class);
    }
}
