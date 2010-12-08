/*
 * Copyright 2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.data.keyvalue.redis.core;

import java.util.Collection;
import java.util.Set;

/**
 * Redis set specific operations.
 * 
 * @author Costin Leau
 */
public interface SetOperations<K, V> {

	Set<V> diff(K key, Collection<K> keys);

	void diffAndStore(K key, K destKey, Collection<K> keys);

	Set<V> intersect(K key, Collection<K> keys);

	void intersectAndStore(K key, K destKey, Collection<K> keys);

	Set<V> union(K key, Collection<K> keys);

	void unionAndStore(K key, K destKey, Collection<K> keys);

	Boolean add(K key, V value);

	Boolean isMember(K key, Object o);

	Set<V> members(K key);

	Boolean remove(K key, Object o);

	V pop(K key);

	Long size(K key);

	RedisOperations<K, V> getOperations();
}
