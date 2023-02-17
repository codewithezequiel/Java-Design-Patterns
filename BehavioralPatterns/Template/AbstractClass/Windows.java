package BehavioralPatterns.Template.AbstractClass;

import BehavioralPatterns.Template.Window;

public abstract class Windows {
    private Window window;

    public Windows() {
        window = new Window();
    }

    public Windows(Window window) {
        this.window = window;
    }

    public void close() {
        window.close();

        doExecute();
    }

    protected abstract void doExecute();

}
