package org.geewax.hellodatastore;

import com.google.gcloud.datastore.BaseEntity;
import com.google.gcloud.datastore.DatastoreService;
import com.google.gcloud.datastore.DatastoreServiceFactory;
import com.google.gcloud.datastore.DatastoreServiceOptions;
import com.google.gcloud.datastore.Entity;
import com.google.gcloud.datastore.Key;
import com.google.gcloud.datastore.KeyFactory;
import com.google.gcloud.datastore.LongValue;


public class HelloDatastore {
  private static final String DATASET = "gcloud-datastore-demo";

  public static void main(String[] args) {

    Key key = Key.builder("dataset", "Person", "Jim").build();
    Entity.Builder builder = Entity.builder(key);
    builder.set("f", 30L).set("name", 3L);
    builder.set("name", "Jim");
    System.out.println(builder.set("f", 30L));
    /*
    DatastoreServiceOptions options = DatastoreServiceOptions.builder().dataset(DATASET).build();
    DatastoreService datastore = DatastoreServiceFactory.getDefault(options);
    KeyFactory keyFactory = (KeyFactory) (datastore.newKeyFactory()).kind("Person");
    Key key = keyFactory.newKey("Jimmy");

    System.out.println("Trying to get the entity by its key!");

    //Entity entity = datastore.get(key);

    if (entity == null) {
      System.out.println("Entity not found! Creating it!");
      Entity.Builder builder = Entity.builder(key);
      System.out.println(builder.set("f", 30L));
      //builder.set("age", 30L).set("other", 30L);
      ((Entity.Builder) builder.set("updated", false)).set("name", "John Doe");
      entity = builder.build();

      //entity = (Entity.builder(key)
          //.set("name", "John Doe")
          //.set("age", 30L))
          //.set("updated", false)
          //.build();
    }
    /*
      datastore.put(entity);
    } else {
      System.out.println("Entity found! Updating it!");
      boolean updated = entity.getBoolean("updated");
      if (!updated) {
        String[] name = entity.getString("name").split(" ");
        entity = Entity.builder(entity)
            .set("name", name[0])
            .set("last_name", name[1])
            .set("updated", true)
            .remove("old_property")
            .set("new_property", 1.1)
            .build();
        datastore.update(entity);
      }
    }

    System.out.println("Done!");*/
  }
}
