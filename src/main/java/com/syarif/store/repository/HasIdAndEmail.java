package com.syarif.store.repository;

import com.syarif.store.util.HasId;

public interface HasIdAndEmail extends HasId {
    String getEmail();
}
