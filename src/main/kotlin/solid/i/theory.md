# Interface segregation principle (ISP)

## IDEA
> Класс не должен переопределять те методы из интерфейса, которые ему не нужны. Для того, чтобы избегать
> жирных интерфейсов.

## Example
> Например, есть интерфейс действий над файлами
```kotlin
interface Document {
    fun open()
    fun edit()
    fun save()
    fun print()
}
```
> Но если мы захотим добавить в программу PDF файл, то нам не нужен будет метод `open`, следовательно мы положим туда
> пустую реализацию.\
> А могли бы сделать несколько интерфейсов
```kotlin
interface OpenableDocument {
    fun open()
}

interface SaveableDocument {
    fun save()
}

interface EditableDocument {
    fun edit()
}

interface PrintableDocument {
    fun print()
}
```