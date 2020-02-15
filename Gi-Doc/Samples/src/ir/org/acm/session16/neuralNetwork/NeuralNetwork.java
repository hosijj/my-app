package ir.org.acm.session16.neuralNetwork;

public class NeuralNetwork {

    private Neuron input1;
    private Neuron input2;
    private Neuron output;

    public String execute(float i1, float i2) {
        input1.setTotal(i1);
        input2.setTotal(i2);
        return String.valueOf(output.fire() >= 1);
    }

    enum Type {
        AND,
        OR,
        XOR,
    }

    public NeuralNetwork(Type type) {
        switch (type) {
            case AND:
                constructAnd();
                break;
            case OR:
                constructOr();
                break;
            case XOR:
                constructXor();
                break;
        }
    }

    private void constructXor() {
        input1 = new Neuron(1, 1);
        input2 = new Neuron(1, 1);
        Neuron middle1 = new Neuron(-1, 1.5f);
        middle1.addInput(input1);
        middle1.addInput(input2);
        Neuron middle2 = new Neuron(1, 0.5f);
        middle2.addInput(input1);
        middle2.addInput(input2);
        output = new Neuron(1, 0.5f);
        output.addInput(middle1);
        output.addInput(middle2);
    }

    private void constructOr() {
        input1 = new Neuron(1, 1);
        input2 = new Neuron(1, 1);
        output = new Neuron(1, 0.9f);
        output.addInput(input1);
        output.addInput(input2);
    }

    private void constructAnd() {
        input1 = new Neuron(1, 1);
        input2 = new Neuron(1, 1);
        output = new Neuron(1, 1.5f);
        output.addInput(input1);
        output.addInput(input2);
    }
}
