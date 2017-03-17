package com.tree;
import java.util.Iterator;
public interface Menu {
Iterator<MenuItem> createIterator();
Iterator<Menu> createIteratorMenu();

}
