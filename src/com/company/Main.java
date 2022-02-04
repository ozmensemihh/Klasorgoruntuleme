package com.company;

import java.nio.file.FileStore;
import java.nio.file.FileSystems;

public class Main {

    public static void main(String[] args) {

        Iterable<FileStore> stores = FileSystems.getDefault().getFileStores();
        for (FileStore store:stores) {
            System.out.println(store.name());
        }
    }
}
