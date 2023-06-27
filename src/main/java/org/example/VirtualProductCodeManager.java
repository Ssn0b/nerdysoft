package org.example;

import java.util.HashSet;
import java.util.Set;

public final class VirtualProductCodeManager {
  private static VirtualProductCodeManager instance;
  private final Set<String> usedCodes;

  private VirtualProductCodeManager() {
    usedCodes = new HashSet<>();
  }

  public static VirtualProductCodeManager getInstance() {
    if (instance == null) {
      instance = new VirtualProductCodeManager();
    }
    return instance;
  }

  public void useCode(String code) {
    usedCodes.add(code);
  }

  public boolean isCodeUsed(String code) {
    return usedCodes.contains(code);
  }
}
