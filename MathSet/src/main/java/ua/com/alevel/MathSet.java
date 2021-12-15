package ua.com.alevel;

public class MathSet {
    private int volume;
    private int count = 0;
    private Number[] mathSet;

    public MathSet() {
        mathSet = new Number[5];
        volume = -1;
    }

    public MathSet(int capacity) {
        mathSet = new Number[capacity];
        this.volume = capacity;
    }

    public MathSet(Number[] numbers) {
        mathSet = new Number[numbers.length];
        volume = -1;
        for (Number n : numbers) {
            add(n);
        }
    }

    public MathSet(Number[]... numbers) {
        volume = -1;
        int totalCountOfNums = getTotalCountOfNumsInVararg(numbers);
        Number[] fullNumbers = new Number[totalCountOfNums];
        mathSet = new Number[totalCountOfNums];
        int k = 0;
        for (Number[] number : numbers) {
            for (Number value : number) {
                fullNumbers[k] = value;
                k++;
            }
        }
        for (Number n : fullNumbers) {
            add(n);
        }
    }

    public MathSet(MathSet numbers) {
        Number[] temp = numbers.toArray();
        volume = numbers.volume;
        mathSet = new Number[numbers.toArray().length];
        for (Number number : temp) {
            add(number);
        }
    }

    public MathSet(MathSet... numbers) {
        volume = -1;
        int totalCountOfNums = 0;
        for (MathSet number : numbers) {
            totalCountOfNums += number.toArray().length;
        }
        mathSet = new Number[totalCountOfNums];
        for (MathSet number : numbers) {
            Number[] temp = number.toArray();
            for (Number value : temp) {
                add(value);
            }
        }
    }

    public void add(Number n) {
        if (isExist(n)) {
            return;
        }
        if (volume == -1) {
            if (mathSet.length == count) {
                Number[] temp = new Number[mathSet.length + 5];
                System.arraycopy(mathSet, 0, temp, 0, mathSet.length);
                mathSet = temp;
            }
            mathSet[count++] = n;
        } else {
            if (count == volume) {
                return;
            } else {
                mathSet[count++] = n;
            }
        }
    }

    public void add(Number... n) {
        for (Number i : n) {
            add(i);
        }
    }

    public void join(MathSet ms) {
        for (Number n : ms.toArray()) {
            add(n);
        }
    }

    public void join(MathSet... ms) {
        MathSet msFromParam = new MathSet(ms);
        join(msFromParam);
    }

    public void intersection(MathSet ms) {
        Number[] numbers = ms.toArray();
        MathSet general = new MathSet();
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < ms.count; j++) {
                if (mathSet[i].doubleValue() == ms.mathSet[j].doubleValue()) {
                    general.add(mathSet[i]);
                }
            }
        }
        clear();
        for (int i = 0; i < general.count; i++) {
            add(general.mathSet[i]);
        }
    }

    public void intersection(MathSet... ms) {
        MathSet generalMathSetFromParam = new MathSet();
        generalMathSetFromParam.join(ms);
        intersection(generalMathSetFromParam);
    }

    public void sortAsc() {
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                Number temp = 0;
                if (mathSet[i].doubleValue() > mathSet[j].doubleValue()) {
                    temp = mathSet[i];
                    mathSet[i] = mathSet[j];
                    mathSet[j] = temp;
                }
            }
        }
    }

    public void sortAsc(int firstIndex, int lastIndex) {
        for (int i = firstIndex; i < lastIndex; i++) {
            for (int j = i + 1; j <= lastIndex; j++) {
                Number temp = 0;
                if (mathSet[i].doubleValue() > mathSet[j].doubleValue()) {
                    temp = mathSet[i];
                    mathSet[i] = mathSet[j];
                    mathSet[j] = temp;
                }
            }
        }
    }

    public void sortAsc(Number value) {
        int index = getIndexOfNumberInArr(value);
        if (index == -1) {
            System.out.println("The given value is not in the MathSet");
            return;
        }
        for (int i = index; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                Number temp = 0;
                if (mathSet[i].doubleValue() > mathSet[j].doubleValue()) {
                    temp = mathSet[i];
                    mathSet[i] = mathSet[j];
                    mathSet[j] = temp;
                }
            }
        }
    }

    public void sortDesc() {
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                Number temp = 0;
                if (mathSet[i].doubleValue() < mathSet[j].doubleValue()) {
                    temp = mathSet[i];
                    mathSet[i] = mathSet[j];
                    mathSet[j] = temp;
                }
            }
        }
    }

    public void sortDesc(int firstIndex, int lastIndex) {
        for (int i = firstIndex; i < lastIndex; i++) {
            for (int j = i + 1; j <= lastIndex; j++) {
                Number temp = 0;
                if (mathSet[i].doubleValue() < mathSet[j].doubleValue()) {
                    temp = mathSet[i];
                    mathSet[i] = mathSet[j];
                    mathSet[j] = temp;
                }
            }
        }
    }

    public void sortDesc(Number value) {
        int index = getIndexOfNumberInArr(value);
        if (index == -1) {
            System.out.println("The given value is not in the MathSet");
            return;
        }
        for (int i = index; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                Number temp = 0;
                if (mathSet[i].doubleValue() < mathSet[j].doubleValue()) {
                    temp = mathSet[i];
                    mathSet[i] = mathSet[j];
                    mathSet[j] = temp;
                }
            }
        }
    }

    public Number get(int index) {
        for (int i = 0; i < count; i++) {
            if (i == index) {
                return mathSet[i];
            }
        }
        return null;
    }

    public Number getMax() {
        Number max = Integer.MIN_VALUE;
        for (Number n : toArray()) {
            if (n.doubleValue() > max.doubleValue()) {
                max = n;
            }
        }
        return max;
    }

    public Number getMin() {
        Number min = Integer.MAX_VALUE;
        for (Number n : toArray()) {
            if (n.doubleValue() < min.doubleValue()) {
                min = n;
            }
        }
        return min;
    }

    public Number getAverage() {
        Number average = 0;
        for (Number n : toArray()) {
            average = average.doubleValue() + n.doubleValue();
        }
        return average.doubleValue() / count;
    }

    public Number getMedian() {
        MathSet clone = new MathSet(this);
        clone.sortAsc();
        int midIndex;
        midIndex = clone.count / 2 - 1;
        if (clone.count % 2 == 0) {
            return (clone.mathSet[midIndex].doubleValue() + clone.mathSet[midIndex + 1].doubleValue()) / 2;
        } else {
            return clone.mathSet[midIndex + 1];
        }
    }

    public Number[] toArray() {
        Number[] res = new Number[count];
        for (int i = 0; i < count; i++) {
            res[i] = mathSet[i];
        }
        return res;
    }

    public Number[] toArray(int firstIndex, int lastIndex) {
        Number[] res = new Number[lastIndex - firstIndex + 1];
        for (int i = 0; i < res.length; i++) {
            res[i] = mathSet[firstIndex++];
        }
        return res;
    }

    public MathSet cut(int firstIndex, int lastIndex) {
        Number[] numbers = toArray(firstIndex, lastIndex);
        return new MathSet(numbers);
    }

    public void clear() {
        for (int i = 0; i < count; i++) {
            mathSet[i] = null;
        }
        count = 0;
    }

    public void clear(Number[] numbers) {
        for (Number number : numbers) {
            for (int j = 0; j < count; j++) {
                if (number.doubleValue() == mathSet[j].doubleValue()) {
                    for (int k = j; k < count - 1; k++) {
                        mathSet[k] = mathSet[k + 1];
                    }
                }
            }
        }
        for (int i = count - 1; i > count - 1 - numbers.length; i--) {
            mathSet[i] = null;
        }
        count -= numbers.length;
    }

    private int getIndexOfNumberInArr(Number n) {
        for (int i = 0; i < count; i++) {
            if (mathSet[i].doubleValue() == n.doubleValue())
                return i;
        }
        return -1;
    }

    private boolean isExist(Number n) {
        for (Number i : mathSet) {
            if (i != null) {
                if (i.doubleValue() == n.doubleValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    private int getTotalCountOfNumsInVararg(Number[]... numbers) {
        int totalCountOfNums = 0;
        for (Number[] number : numbers) {
            for (int j = 0; j < number.length; j++) {
                totalCountOfNums++;
            }
        }
        return totalCountOfNums;
    }

}
