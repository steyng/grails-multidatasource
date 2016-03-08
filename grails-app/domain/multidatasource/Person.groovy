package multidatasource

class Person {

    String name
    String surname

    static mapping = {
        cache 'read-only'
    }
}
