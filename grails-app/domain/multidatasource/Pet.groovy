package multidatasource

class Pet {

    String name
    String type

    static mapping = {
        datasource 'reportingDB'
        cache 'read-only'
    }
}
