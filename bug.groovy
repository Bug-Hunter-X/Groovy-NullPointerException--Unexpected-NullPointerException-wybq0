def myMethod(param) {
  if (param == null) {
    throw new NullPointerException("Parameter cannot be null")
  }
  // ... rest of the method
}

myMethod(null)