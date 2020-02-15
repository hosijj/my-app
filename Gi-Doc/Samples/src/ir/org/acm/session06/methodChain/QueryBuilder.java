package ir.org.acm.session06.methodChain;

public class QueryBuilder {

    StringBuffer query = new StringBuffer();

    QueryBuilder select(String attributes){
        this.query.append("SELECT ").append(attributes);
        return this;
    }

    QueryBuilder from(String tableName){
        this.query.append(" FROM ").append(tableName);
        return this;
    }

    QueryBuilder where(String conditions){
        this.query.append(" WHERE ").append(conditions);
        return this;
    }

    void print() {
        System.out.println(this.query);
    }

}
