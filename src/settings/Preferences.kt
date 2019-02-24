package settings

object Preferences {

    private var cache = HashMap<String, Any>()

    fun set(key: String, value: Any) {
        cache[key] = value
    }

    fun get(key: String): Any? {
        return cache[key]
    }
}