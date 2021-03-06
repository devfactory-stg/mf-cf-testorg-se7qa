package com.restoratio.monaco.ruletest.squid.compliant;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class S2118Rule {

    public void meal() throws IOException {
        Vegetable2 veg = new Vegetable2();
        veg.setId(1);
        veg.setName("Test");
        FileOutputStream fout = new FileOutputStream(veg.getName());
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        oos.writeObject(veg); // Noncompliant. Nothing will be written
        fout.close();
    }

    class Vegetable2 implements Serializable {

        private static final long serialVersionUID = -5702255064538433834L;

        private Integer id;
        private String name;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }


}

