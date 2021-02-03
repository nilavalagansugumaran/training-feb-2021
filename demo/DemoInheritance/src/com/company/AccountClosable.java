package com.company;

import java.io.Serializable;

public interface AccountClosable extends Serializable {
    int VALUE = 1000; // static final constant
    void closeAccount(); // internally public and abstract

    // can have many methods
}
