package com.javad.command.filesystem;

public class Main {
    public static void main(String[] args) {
        var fileSystem = FileSystemUtil.getFileSystem();

        OpenFileCommand openFileCommand  = new OpenFileCommand(fileSystem);
        var invoker = new FileInvoker(openFileCommand);
        invoker.execute();

        CloseFileCommand closeFileCommand = new CloseFileCommand(fileSystem);
        var closeInvoker = new FileInvoker(closeFileCommand);
        closeInvoker.execute();

        WriteFileCommand writeFileCommand  = new WriteFileCommand(fileSystem);
        var writeInvoker = new FileInvoker(writeFileCommand);
        writeInvoker.execute();

    }
}
