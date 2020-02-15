package ir.org.acm.session16.neuralNetwork;

public class NeuralNetworkTest {

    public static void main(String[] args) {

//        NeuralNetwork andNet = new NeuralNetwork(NeuralNetwork.Type.AND);
//        System.out.println(andNet.execute(1, 1));

        NeuralNetwork orNet = new NeuralNetwork(NeuralNetwork.Type.OR);
        System.out.println(orNet.execute(1, 1));

//        NeuralNetwork xorNet = new NeuralNetwork(NeuralNetwork.Type.XOR);
//        System.out.println(xorNet.execute(1, 0));

    }
}
