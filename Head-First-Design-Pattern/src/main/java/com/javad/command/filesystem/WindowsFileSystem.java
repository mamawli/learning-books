package com.javad.command.filesystem;

public class WindowsFileSystem implements FileSystemReceiver {
    @Override
    public void openFile() {
        System.out.println("file is opening in windows system");
    }

    @Override
    public void closeFile() {
        System.out.println("file is closing in windows system");
    }

    @Override
    public void writeFile() {
        System.out.println("writing file in windows system");
    }
}
