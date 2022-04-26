package com.geekbrains.cloud.stream;

import java.util.ArrayList;
import java.util.List;

public class Command {

    private List toMerge = new ArrayList();
    private List toUnmerge = new ArrayList();

    public Command() {
    }

    public Command(List toMerge) {
        this.toMerge = toMerge;
    }

    public List getToMerge() {
        return toMerge;
    }

    public List getToUnmerge() {
        return toUnmerge;
    }

    public void execute() {
        getToMerge().forEach(System.out::println);
    }

}
