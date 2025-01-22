package ${package};

import jpize.app.Jpize;
import jpize.app.JpizeApplication;
import jpize.gl.Gl;

public class ${class-name} extends JpizeApplication {

    public ${class-name}() { }

    @Override
    public void init() { }

    @Override
    public void update() { }

    @Override
    public void render() {
        Gl.clearColorBuffer();
    }

    @Override
    public void resize(int width, int height) { }

    @Override
    public void dispose() { }

    public static void main(String[] args) {
        Jpize.create(1280, 720, "${class-name}")
                .icon("/icon.png")
                .build().setApp(new ${class-name}());
        Jpize.run();
    }

}