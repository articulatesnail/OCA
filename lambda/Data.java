package lambda;

interface semirebra {
    public void process(int a, int b);
}

public class Data{
    int value;
    Data(int value){
        this.value = value;
    }
}

public void processList(ArrayList<Data> dataList, semirebra a){
    for(Data d: dataList){
        a.process(d.value,d.value);
    }
}
