package com.google.code.morphia.mapping.lazy;


import com.google.code.morphia.Datastore;


/**
 * for use with DatastoreProvider.Default
 */
public final class DatastoreHolder {
  private static final DatastoreHolder INSTANCE = new DatastoreHolder();

  public static DatastoreHolder getInstance() {
    return INSTANCE;
  }

  private DatastoreHolder() {
  }

  private Datastore ds;

  public Datastore get() {
    return ds;
  }

  public void set(final Datastore store) {
    ds = store;
  }
}