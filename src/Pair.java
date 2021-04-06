public class Pair<I, S> {
    private I valueInt;
    private S valueString;

    public static <I, S> Pair<I, S> of(Pair<Integer, String> pair) {

    }

    public void setValueString(S valueString) {
        this.valueString = valueString;
    }

    public void setValueInt(I valueInt) {
        this.valueInt = valueInt;
    }

    public I getFirst() {
        return valueInt;
    }

    public S getSecond() {
        return valueString;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null) {
            return false;
        }

        if (o instanceof Pair) {
            Pair<I, S> first = (Pair<I, S>) o;
            return (first.getFirst()).equals(((Pair<I, S>) o).getFirst()) &&
                    ((Pair<I, S>) o).getSecond().equals(first.getSecond());
        }
        return false;
    }

    public int hashCode() {
        int result = 31;
        result = result * 31 + (getFirst() == null ? 0 : getFirst().hashCode());
        result = result * 31 + (getSecond() == null ? 0 : getFirst().hashCode());
        return result;
    }

}


