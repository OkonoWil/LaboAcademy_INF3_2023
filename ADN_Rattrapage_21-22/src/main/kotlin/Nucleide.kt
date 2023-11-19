enum class Nucleide(val value: String) : Complement {
    Adenine("A"){
        override fun complement(): Nucleide {
            return Nucleide.Uracile

        };
        override fun toString(): String {
            return Nucleide.Adenine.value
        }
    },
    Cytosine("C"){
        override fun complement(): Nucleide {
            return Nucleide.Guanine
        };
        override fun toString(): String {
            return Nucleide.Cytosine.value
        }
    },
    Guanine("G"){
        override fun complement(): Nucleide {
            return Nucleide.Cytosine
        };
        override fun toString(): String {
            return Nucleide.Guanine.value
        }
    },
    Uracile("U"){
        override fun complement(): Nucleide {
            return Nucleide.Adenine
        };
        override fun toString(): String {
            return Nucleide.Uracile.value
        }
    };

    override fun toString(): String {
        return this.value
    }

}