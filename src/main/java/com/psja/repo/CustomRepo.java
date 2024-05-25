package com.psja.repo;

import java.util.List;

public interface CustomRepo<T> {

	public List<T> getErtbMessage( String applicationName );
}
