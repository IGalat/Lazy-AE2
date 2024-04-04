Fork of https://github.com/phantamanta44/Lazy-AE2. If you aren't familiar with LazyAE, go read that.

## Changes

Now requires [my fork of libnine](https://github.com/IGalat/libnine)

### Level Maintainer

- Fixed the critical bug where numbers in all LMs would change when any LM ordered anything
- Removed little numbers on items - duplicate info, already present in quantity slot
- Removed checkboxes, as now they're unnecessary


### Big Assembler

- Removed little numbers on items - duplicate info, already present in quantity slot

---

---

Notes to developers / reminder to me:

Gradle version here is super duper old, forge version is also different.
Because of this(?), `L9TileEntityTickingWrapper` exists.
IDEA gradle reload on any issues.

After `gradlew:77` add `JAVACMD="C:\Users\Ilya\.jdks\corretto-1.8.0_312\bin\java"` 
or whatever jdk path unless it's same as JAVA_HOME