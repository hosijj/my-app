package ir.org.acm.session06.methodChain;

public class TestQueryBuilder {

    public static void main(String[] args) {

        QueryBuilder query = new QueryBuilder();

        query
                .select("branchName")
                .from("branches")
                .where("branchCode=284")
                .print(); // "SELECT branchName FROM branches WHERE branchCode=284"


    }

}
