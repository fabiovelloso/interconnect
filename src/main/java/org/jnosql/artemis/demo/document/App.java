package org.jnosql.artemis.demo.document;

import org.jnosql.artemis.document.DocumentRepository;
import org.jnosql.diana.api.document.Document;
import org.jnosql.diana.api.document.DocumentCondition;
import org.jnosql.diana.api.document.DocumentQuery;

import java.util.Arrays;
import java.util.Optional;
//import org.jboss.weld.environment.se.Weld;
//import org.jboss.weld.environment.se.WeldContainer;

import static org.jnosql.artemis.demo.document.DocumentDatabaseQualifier.COUCHBASE;
import static org.jnosql.artemis.demo.document.DocumentDatabaseQualifier.MONGODB;

public class App {

//    private static final Person PERSON = Person.builder().
//            withPhones("123456789")
//            .withName("Name")
//            .withId("3")
//            .withIgnore("Just Ignore").build();
//
//    public static void main(String[] args) {
//        Weld weld = new Weld();
//        try (WeldContainer weldContainer = weld.initialize()) {
//
//            System.out.println(" Using mongo database");
//            DocumentRepository crudOperation = weldContainer.instance().select(DocumentRepository.class)
//                    .select(MONGODB).get();
//
//            Person saved = crudOperation.save(PERSON);
//            System.out.println("Person saved" + saved);
//
//            DocumentQuery query = DocumentQuery.of("Person");
//            query.and(DocumentCondition.eq(Document.of("_id", 3L)));
//
//            Optional<Person> person = crudOperation.singleResult(query);
//            System.out.println("Entity found: " + person);

//            System.out.println(" Using mongodb database");
//
//            crudOperation = weldContainer.instance().select(DocumentRepository.class)
//                    .select(MONGODB).get();
//
//            saved = crudOperation.save(PERSON);
//            System.out.println("Person saved" + saved);
//
//            query = DocumentQuery.of("Person");
//            query.and(DocumentCondition.eq(Document.of("_id", 1L)));
//
//            person = crudOperation.singleResult(query);
//            System.out.println("Entity found: " + person);
//
//        }
//    }
}
