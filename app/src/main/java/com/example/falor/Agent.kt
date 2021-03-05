package com.example.falor

data class Agent(
    val name: String = "",
    val role: String = "",
    val biography: String = "",
    val abilities: List<String>,
    val image: Int = 0,
    val imageDetail: Int = 0
)

val agentsData: List<Agent> =
    listOf(
        Agent(
            "Brimstone",
            "controller",
            "Joining from the USA, Brimstone's orbital arsenal ensures his squad always has the advantage. His ability to deliver utility precisely and from a distance make him an unmatched boots-on-the-ground commander.",
            listOf("Incendiary", "Sky smoke", "Stim beacon", "Orbital Strike"),
            R.drawable.brimstone,
            R.drawable.brimstone_detail
        ),
        Agent(
            "Phoenix",
            "duelist",
            "Hailing from the U.K., Phoenix's star power shines through in his fighting style, igniting the battlefield with flash and flare. Whether he's got backup or not, he'll rush into a fight on his own terms.",
            listOf("Curveball", "Hot hands", "Blaze", "Run it back"),
            R.drawable.phoenix,
            R.drawable.phoenix_detail
        ),
        Agent(
            "Sage",
            "sentinel",
            "The stronghold of China, Sage creates safety for herself and her team wherever she goes. Able to revive fallen friends and stave off aggressive pushes, she provides a calm center to a hellish fight.",
            listOf("Slow orb", "Healing orb", "Barrier orb", "Resurrection"),
            R.drawable.sage,
            R.drawable.sage_detail
        ),
        Agent(
            "Sova",
            "initiator",
            "Born from the eternal winter of Russia's tundra, Sova tracks, finds, and eliminates enemies with ruthless efficiency and precision. His custom bow and incredible scouting abilities ensure that even if you run, you cannot hide.",
            listOf("Shock bolt", "Recon bolt", "Owl drone", "Hunter's Fury"),
            R.drawable.sova,
            R.drawable.sova_detail
        ),
        Agent(
            "Viper",
            "controller",
            "The American chemist, Viper deploys an array of poisonous chemical devices to control the battlefield and cripple the enemy's vision. If the toxins don't kill her prey, her mind games surely will.",
            listOf("Poison cloud", "Toxic screen", "Snake bite", "Viper's pit"),
            R.drawable.viper,
            R.drawable.viper_detail
        ),
        Agent(
            "Cypher",
            "sentinel",
            "The Moroccan information broker, Cypher is a one-man surveillance network who keeps tabs on the enemy's every move. No secret is safe. No maneuver goes unseen. Cypher is always watching.",
            listOf("Cyber cage", "Spycam", "Trapwire", "Neural theft"),
            R.drawable.cypher,
            R.drawable.cypher_detail
        ),
        Agent(
            "Reyna",
            "duelist",
            "Forged in the heart of Mexico, Reyna dominates single combat, popping off with each kill she scores. Her capability is only limited by her raw skill, making her highly dependent on performance.",
            listOf("Devour", "Dismiss", "Leer", "Empress"),
            R.drawable.reyna,
            R.drawable.reyna_detail
        ),
        Agent(
            "Killjoy",
            "sentinel",
            "The genius of Germany. Killjoy secures the battlefield with ease using her arsenal of inventions. If the damage from her gear doesn't stop her enemies, her robots' debuff will help make short work of them.",
            listOf("Alarmbot", "Turret", "Nanoswarm", "Lockdown"),
            R.drawable.killjoy,
            R.drawable.killjoy_detail
        ),
        Agent(
            "Breach",
            "initiator",
            "Breach, the bionic Swede, fires powerful, targeted kinetic blasts to aggressively clear a path through enemy ground. The damage and disruption he inflicts ensures no fight is ever fair.",
            listOf("Flashpoint", "Fault line", "Aftershock", "Rolling thunder"),
            R.drawable.breach,
            R.drawable.breach_detail
        ),
        Agent(
            "Omen",
            "controller",
            "A phantom of a memory, Omen hunts in the shadows. He renders enemies blind, teleports across the field, then lets paranoia take hold as his foe scrambles to learn where he might strike next.",
            listOf("Paranoia", "Dark cover", "Shrouded step", "From the shadows"),
            R.drawable.omen,
            R.drawable.omen_detail
        ),
        Agent(
            "Jett",
            "duelist",
            "Representing her home country of South Korea, Jett's agile and evasive fighting style lets her take risks no one else can. She runs circles around every skirmish, cutting enemies before they even know what hit them.",
            listOf("Updraft", "Tailwind", "Cloudburst", "Blade strom"),
            R.drawable.jett,
            R.drawable.jett_detail
        ),
        Agent(
            "Raze",
            "duelist",
            "Raze explodes out of Brazil with her big personality and big guns. With her blunt-force-trauma playstyle, she excels at flushing entrenched enemies and clearing tight spaces with a generous dose of “boom.”",
            listOf("Blast pack", "Paint shells", "Boom bot", "Showstopper"),
            R.drawable.raze,
            R.drawable.raze_detail
        ),
        Agent(
            "Skye",
            "initiator",
            "Hailing from Australia, Skye and her band of beasts trail-blaze the way through hostile territory. With her creations hampering the enemy, and her power to heal others, the team is strongest and safest by Skye’s side.",
            listOf("Trailblazer", "Guiding light", "Regrowth", "Seekers"),
            R.drawable.skye,
            R.drawable.skye_detail
        )
    )

