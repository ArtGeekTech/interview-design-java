package com.agt.effectivecleancode.pattern.builder;

public class ImmutableOptionalConfigurableObject {
    private final String field1; // required
    private final int field2; // required
    private final String field3; // optional
    private final Integer field4; // optional, >= 4 fields, to cure bloated constructors

    // favor static member classes over non-static, no need to ref Outer.this.xxx
    public static class Builder {
        private String field1;
        private int field2;
        private String field3 = "default"; // define default values in one place
        private Integer field4 = null; // in case NULL makes more sens

        private Builder(String field1, int field2) {
            this.field1 = field1;
            this.field2 = field2;
        }

        private Builder(ImmutableOptionalConfigurableObject object) {
            // private members are accessible only from the top-level classes where it is declared
            this.field1 = object.field1;
            this.field2 = object.field2;
            this.field3 = object.field3;
            this.field4 = object.field4;
        }

        public Builder setField1(String field1) {
            this.field1 = field1;
            return this;
        }

        public Builder setField2(int field2) {
            this.field2 = field2;
            return this;
        }

        public Builder setField3(String field3) {
            this.field3 = field3;
            return this;
        }

        public Builder setField4(Integer field4) {
            this.field4 = field4;
            return this;
        }

        public ImmutableOptionalConfigurableObject build() {
            return new ImmutableOptionalConfigurableObject(this);
        }
    }

    public static Builder newBuilder(String field1, int field2) {
        return new Builder(field1, field2);
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    private ImmutableOptionalConfigurableObject(Builder builder) {
        // private members are accessible only from the top-level classes where it is declared
        this.field1 = builder.field1;
        this.field2 = builder.field2;
        this.field3 = builder.field3;
        this.field4 = builder.field4;
    }

    @Override
    public String toString() {
        return String.join("|", field1, field2 + "", field3, field4 + "");
    }
}
