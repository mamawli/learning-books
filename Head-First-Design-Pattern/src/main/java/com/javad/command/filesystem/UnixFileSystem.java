package com.javad.command.filesystem;

public class UnixFileSystem implements FileSystemReceiver{
    @Override
    public void openFile() {
        System.out.println("file is opening in unix system");
    }

    @Override
    public void closeFile() {
        System.out.println("file is closing in unix system");
    }

    @Override
    public void writeFile() {
        System.out.println("writing file in unix system");
    }
}
