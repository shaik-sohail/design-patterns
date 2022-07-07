package prototypeDesignPattern;

public abstract class MobilePrototype implements Cloneable {
            protected String softwareName;
            protected String modelName;
            abstract void information();
            @Override
            public Object clone()  {
                Object clone = null;
                try
                {
                    clone = super.clone();
                }
                catch (CloneNotSupportedException e)
                {
                    e.printStackTrace();
                }
                return clone;
            }
}
