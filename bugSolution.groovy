def myMethod(param) {
  if (param == null) {
    return defaultValue // or handle null appropriately
  }
  // ... rest of the method
}

or
def myMethod(String param) {
  // ... method body
}

myMethod(null) // This will now result in a different exception (e.g., MissingMethodException) which is more expected behavior.