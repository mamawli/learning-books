package com.javad.command.filesystem;

public class FileSystemUtil {
    public static FileSystemReceiver getFileSystem() {

        var os = System.getProperty("os.name");
        System.out.println("os is " + os);
        if (os.contains("Windows"))
            return new WindowsFileSystem();
        else
            return new UnixFileSystem();
    }
}
